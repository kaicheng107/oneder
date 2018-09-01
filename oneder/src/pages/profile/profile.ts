import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { PlayerServiceProvider } from '../../providers/player-service/player-service';
import {Player} from '../../entities/Player'

/**
 * Generated class for the ProfilePage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-profile',
  templateUrl: 'profile.html',
})
export class ProfilePage {


  play: Player;

  constructor(public navCtrl: NavController, 
    public navParams: NavParams,  
    public playerService: PlayerServiceProvider) {
      this.playerService.getPlayer().subscribe(rep =>{
        console.log(rep);
        this.play=rep;
        console.log(this.play.name);
        console.log(this.play.aggregatedRating);
      });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ProfilePage');
    
  }

  
}
