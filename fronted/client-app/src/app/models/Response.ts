import { Client } from "./Client";

export interface Response {
  tipoRespuesta: string;
  responseError: ResponseError;
  response?: Client;
}

interface ResponseError {
  codeError: number;
  detailError: string;
  typeError?: string;
  systemError?: string;
}