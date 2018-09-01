import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the OneMapProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/

@Injectable()
export class OneMapProvider {
api:string="https://developers.onemap.sg"
  constructor(public http: HttpClient) {
    console.log('Hello OneMapProvider Provider');
  }

  getApi(){
    return this.api;
  }

  updateApi(newApi:string){
    this.api = newApi;
  }

  getLocation(){
    return this.http.get(this.api);
  }
}
