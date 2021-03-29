import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';
import { Node } from "../../models/Node";

@Component({
  selector: 'app-view-all',
  templateUrl: './view-all.component.html',
  styleUrls: ['./view-all.component.css']
})
export class ViewAllComponent implements OnInit {

  responseService: Node;

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {

    this.apiService.getAllInformation().subscribe(data => {
      if (data.tipoRespuesta === 'OK') {
        this.responseService = data.response;
      }
    });

  }
}
