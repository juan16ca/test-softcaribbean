import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-client',
  templateUrl: './form-client.component.html',
  styleUrls: ['./form-client.component.css']
})
export class FormClientComponent implements OnInit {

  constructor(private formBuilder: FormBuilder) { }

  listField: any[] = [
    { "name": "identificationNumber", "label": "Número de identificación" },
    { "name": "names", "label": "Nombres" },
    { "name": "lastName", "label": "Apellidos" },
    { "name": "direction", "label": "Direccion" },
    { "name": "email", "label": "Correo" },
    { "name": "telephone", "label": "Telefono" },
    { "name": "telephoneAditional", "label": "Telefono adicional" },
    { "name": "phone", "label": "Número de celular" },
    { "name": "position", "label": "Cargo" },
    { "name": "descriptionPosition", "label": "Descripción cargo" },
    { "name": "city", "label": "Ciudad" },
    { "name": "descriptionCity", "label": "Descripción ciudad" },
    { "name": "birthDay", "label": "Fecha de nacimiento" },
    { "name": "gender", "label": "Genero" },
    { "name": "community", "label": "Comunidad" },
    { "name": "descripcionCommunity", "label": "Descripción comunidad" },
    { "name": "companyName", "label": "Nombre empresa" },
    { "name": "divition", "label": "División" },
    { "name": "descriptionDivition", "label": "Descripción división" },
    { "name": "country", "label": "Pais" },
    { "name": "descripcionCountry", "label": "Descripción pais" },
    { "name": "hobbies", "label": "Hobbies" },
  ];

  addForm: FormGroup;

  ngOnInit(): void {

    this.addForm = this.formBuilder.group({
      identificationNumber: ['', Validators.required],
      names: ['', Validators.required],
      lastName: ['', Validators.required],
      direction: ['', Validators.required],
      email: ['', Validators.required],
      telephone: ['', Validators.required],
      telephoneAditional: ['', Validators.required],
      phone: ['', Validators.required],
      position: ['', Validators.required],
      descriptionPosition: ['', Validators.required],
      city: ['', Validators.required],
      descriptionCity: ['', Validators.required],
      birthDay: ['', Validators.required],
      gender: ['', Validators.required],
      community: ['', Validators.required],
      descripcionCommunity: ['', Validators.required],
      companyName: ['', Validators.required],
      divition: ['', Validators.required],
      descriptionDivition: ['', Validators.required],
      country: ['', Validators.required],
      descripcionCountry: ['', Validators.required],
      hobbies: ['', Validators.required],
    });
  }



  register(e) {
    e.preventDefault();
    console.log("register");

    console.log(this.addForm.value);
  }

}
