import { Client } from "./Client";

export interface Node {
  client: Client;
  nodeLeft?: Node;
  nodeRight: Node;
}

