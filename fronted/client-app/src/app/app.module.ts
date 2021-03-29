import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { FormClientComponent } from './components/form-client/form-client.component';
import { RouterModule, Routes } from '@angular/router';
import { FormGetComponent } from './components/form-get/form-get.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { ViewAllComponent } from './components/view-all/view-all.component';

const rutas: Routes = [
  { path: 'create', component: FormClientComponent },
  { path: 'search', component: FormGetComponent },
  { path: 'all', component: ViewAllComponent },
];


@NgModule({
  declarations: [
    AppComponent,
    FormClientComponent,
    FormGetComponent,
    NavBarComponent,
    ViewAllComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      rutas
    )

  ],
  providers: [],
  bootstrap: [AppComponent]
})


export class AppModule { }
