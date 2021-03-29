import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Client } from 'src/app/models/Client';
import { ApiService } from "../../services/api.service";


@Component({
  selector: 'app-form-get',
  templateUrl: './form-get.component.html',
  styleUrls: ['./form-get.component.css']
})
export class FormGetComponent implements OnInit {

  searchForm: FormGroup;
  information: Client;
  searchFound: boolean;

  listField: any[] = [
    { "name": "identificationNumber", "label": "Número de identificación" },
    { "name": "names", "label": "Nombres" },
    { "name": "lastName", "label": "Apellidos" },
    { "name": "email", "label": "Correo" },
    { "name": "telephone", "label": "Telefono" },
    { "name": "telephoneAditional", "label": "Telefono adicional" },
    { "name": "phone", "label": "Número de celular" },
    { "name": "birthDay", "label": "Fecha de nacimiento" },
    { "name": "gender", "label": "Genero (M/F)" },
    { "name": "companyName", "label": "Nombre empresa" },
    { "name": "hobbies", "label": "Hobbies" },
  ];

  constructor(private formBuilder: FormBuilder, private apiService: ApiService) { }

  ngOnInit(): void {

    this.searchFound = false;

    this.searchForm = this.formBuilder.group({
      identificationNumber: ['', Validators.required],
    });
  }

  search(e) {
    if (this.searchForm.valid) {

      this.apiService.getInfoClientFromTree(this.searchForm.get('identificationNumber').value).subscribe(data => {
        if (data.tipoRespuesta === 'OK') {
          this.searchFound = true;
          this.information = data.response;
        } else {
          this.searchFound = false;
        }

      });
    } else {
      return;
    }
  }

}
