import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the PlayerServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class PlayerServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello PlayerServiceProvider Provider');
  }

    baseUrl = "http://localhost:8080/onederNetBean-war/Resources/player";

    getPlayer(){
      return this.http.get(this.baseUrl);
    }

}
