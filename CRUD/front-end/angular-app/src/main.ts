import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter } from '@angular/router';
import { App } from './app/app';

import { CarroListComponent } from './app/pages/carros/carro-list/carro-list.component';
import { Home } from './app/pages/Home';
import { provideHttpClient } from '@angular/common/http';
import { CarroCreateComponent } from './app/pages/carros/carro-create/carro-create.component';
import { CarroEditComponent } from './app/pages/carros/carro-edit/carro-edit.component';

bootstrapApplication(App, {
  providers: [
    provideRouter([
      { path: '', component: Home },
      { path: 'carros', component: CarroListComponent },
      { path: 'carros/novo', component: CarroCreateComponent },
      { path: 'carros/editar/:id', component: CarroEditComponent },
    ]),
    provideHttpClient()
  ]
});