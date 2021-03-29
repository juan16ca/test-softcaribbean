import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Client} from "../models/Client";
import {Response} from "../models/Response";
import { ResponseNode } from '../models/ResponseNode';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  baseUrl: string;

  constructor(private http: HttpClient) {

    this.baseUrl = 'http://localhost:8090/api/';
  }

  createUser(client: Client): Observable<Response> {
    return this.http.post<Response>(this.baseUrl + 'create', client);
  }

  getInfoClientFromTree(identificationNumber:number): Observable<Response> {
    return this.http.get<Response>(this.baseUrl + 'getClient/'+identificationNumber);
  }

  getAllInformation(): Observable<ResponseNode> {
    return this.http.get<ResponseNode>(this.baseUrl + 'getAllClient');
  }


}
