import { Client } from "./Client";
import { ResponseError } from "./ResponseError";

export interface Response {
  tipoRespuesta: string;
  responseError: ResponseError;
  response?: Client;
}

