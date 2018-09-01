import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { MatchesPage } from '../matches/matches';
/**
 * Generated class for the CMatchPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@Component({
  selector: 'page-c-match',
  templateUrl: 'c-match.html',
})
export class CMatchPage {
  Matches = MatchesPage;
  constructor(public navCtrl: NavController, public navParams: NavParams) {
    
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad CMatchPage');
  }

	toSignUp()
	{
		this.navCtrl.push(MatchesPage, {fromPage: 'CMatchPage'})
	}
}
