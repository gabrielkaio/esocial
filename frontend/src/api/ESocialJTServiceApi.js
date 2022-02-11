import { useMutation, useQuery, useQueryClient } from "react-query";
import { ESOCIAL_JT_SERVICE_URL } from "../shared/env";
import createApi, { createQueryFetcher } from "./api";

export const api = createApi(ESOCIAL_JT_SERVICE_URL);
const queryFetcher = createQueryFetcher(api);
const REFRESH_INTERVAL = 5000;
const PAGE_SIZE = 25;

export function useOcorrencias() {
  return useQuery(`/ocorrencias/dados-basicos`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useOcorrenciasPaginado(page = 0) {
  return useQuery(
    `/ocorrencias/paginado?page=${page}&size=${PAGE_SIZE}`,
    queryFetcher,
    {
      refetchInterval: REFRESH_INTERVAL,
      initialData: {},
      keepPreviousData: true
    }
  );
}

export function useDetalheOcorrencia(id) {
  return useQuery(`/ocorrencias/${id}`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL
  });
}

export function useLimparProducaoRestrita() {
  const queryClient = useQueryClient();
  return useMutation(() => api.post(`/producao-restrita/acoes/limpar`), {
    onSuccess: () =>
      queryClient.setQueryData(
        `/ocorrencias/paginado?page=0&size=${PAGE_SIZE}`,
        { empty: true }
      )
  });
}

export function useESocialJTStatus() {
  return useQuery(`/actuator/health`, queryFetcher);
}

export function useESocialGovStatus() {
  return useQuery(`/actuator/esocialhealth`, queryFetcher);
}