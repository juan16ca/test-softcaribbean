import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from "../../services/api.service";

@Component({
  selector: 'app-form-client',
  templateUrl: './form-client.component.html',
  styleUrls: ['./form-client.component.css']
})
export class FormClientComponent implements OnInit {

  registerSuccess: boolean;
  fieldsError: any;
  listErrors: any[];

  constructor(private formBuilder: FormBuilder, private apiService: ApiService) {

    this.registerSuccess = false;
  }

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
    { "name": "gender", "label": "Genero (M/F)" },
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
      position: ['', [Validators.required,Validators.pattern("^[0-9]*$")]],
      descriptionPosition: ['', Validators.required],
      city: ['',[ Validators.required,,Validators.pattern("^[0-9]*$")]],
      descriptionCity: ['', Validators.required],
      birthDay: ['', Validators.required],
      gender: ['', [Validators.required, Validators.maxLength(1)]],
      community: ['', [Validators.required,Validators.pattern("^[0-9]*$")]],
      descripcionCommunity: ['', Validators.required],
      companyName: ['', Validators.required],
      divition: ['', [Validators.required,Validators.pattern("^[0-9]*$")]],
      descriptionDivition: ['', Validators.required],
      country: ['', [Validators.required,Validators.pattern("^[0-9]*$")]],
      descripcionCountry: ['', Validators.required],
      hobbies: ['', Validators.required],
    });
  }

  register(e) {
    e.preventDefault();
    console.log("register");

    console.log(this.addForm.valid);

    if (this.addForm.valid) {

      console.log(this.addForm.value);
      this.apiService.createUser(this.addForm.value).subscribe(data => {

        if(data.tipoRespuesta = 'OK'){
          this.registerSuccess = true;
        }
        
      });
    } else {
      this.listErrors = this.findInvalidControls();
     return;
    }

  }

  private findInvalidControls() {
    const invalid = [];
    const controls = this.addForm.controls;
    for (const name in controls) {
        if (controls[name].invalid) {
          console.log(controls[name].errors);
            invalid.push(name);
        }
    }

    console.log("salida: "+invalid)
    return invalid;
}

}
