import { ResponseError } from "./ResponseError";
import { Node } from "./Node";

export interface ResponseNode {
    tipoRespuesta: string;
    responseError: ResponseError;
    response?: Node;
  }