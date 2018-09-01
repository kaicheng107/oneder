import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import {Geolocation} from '@ionic-native/geolocation';
import { OneMapProvider } from '../../providers/one-map/one-map';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
  lat: any;
  lng: any;
  api: string;
  R:number =6378137;
  dn:number=2000;
  de:number =2000;
  dLat: number;
  dLng: number;
  latO: number;
  lngO: number;
  dn1:number=-2000;
  de1:number =-2000;
  lat1: number;
  lng1: number;

  location: string;
  constructor(public navCtrl: NavController, public geolocation: Geolocation, private oneMap: OneMapProvider,public http: HttpClient) {
    this.api = this.oneMap.getApi();
  }

  ionViewDidLoad(){
    this.geolocation.getCurrentPosition().then(resp => {
      this.lat= resp.coords.latitude;
      this.lng = resp.coords.longitude;

      this.lat= 1.2757465;
      this.lng = 103.7995801;
      
      this.dLat = this.dn/this.R;
      this.dLng = this.de/(this.R*Math.cos(Math.PI*this.lat/180));

      this.latO = this.lat + this.dLat * 180/Math.PI;
      this.lngO = this.lng + this.dLng * 180/Math.PI; 

      this.dLat = this.dn1/this.R;
      this.dLng = this.de1/(this.R*Math.cos(Math.PI*this.lat/180));

      this.lat1 = this.lat + this.dLat * 180/Math.PI;
      this.lng1 = this.lng + this.dLng * 180/Math.PI; 

      console.log(this.latO);
      console.log(this.lngO);
      console.log(this.lat1);
      console.log(this.lng1);

      this.api = this.api+"/privateapi/commonsvc/revgeocode/?location="+this.lat+","+this.lng+"&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjE5NjcsInVzZXJfaWQiOjE5NjcsImVtYWlsIjoia2FpY2hlbmcxMDdAZ21haWwuY29tIiwiZm9yZXZlciI6ZmFsc2UsImlzcyI6Imh0dHA6XC9cL29tMi5kZmUub25lbWFwLnNnXC9hcGlcL3YyXC91c2VyXC9zZXNzaW9uIiwiaWF0IjoxNTM1Nzc0ODE0LCJleHAiOjE1MzYyMDY4MTQsIm5iZiI6MTUzNTc3NDgxNCwianRpIjoiMTYwNGZiYWFmNGU3MDA0Zjg1ZmRiN2NmYzkyOWE3ZjQifQ.u3I2F87wL6C7yY0dHNfpUP-hPNo-iOMwvEEoOmV8SE4"+"&buffer=10"+"&addressType=All"+"&otherFeatures=N";


        this.oneMap.updateApi(this.api);

        this.oneMap.getLocation().subscribe(curloc =>{
            console.log(curloc.GeocodeInfo[0].ROAD);
            //.GeocodeInfo[0].ROADs
            this.location = curloc.GeocodeInfo[0].ROAD;
          });

     }).catch(error => {
       console.log('Error getting location', error)
      });
  }

}
