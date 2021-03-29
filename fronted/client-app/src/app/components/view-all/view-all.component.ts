import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-view-all',
  templateUrl: './view-all.component.html',
  styleUrls: ['./view-all.component.css']
})
export class ViewAllComponent implements OnInit {

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {

    this.apiService.getAllInformation().subscribe(data => {

      console.log(data.response);
      if (data.tipoRespuesta === 'OK') {
        
      } else {
        
      }

    });

  }

}
