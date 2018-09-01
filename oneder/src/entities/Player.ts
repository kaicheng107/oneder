import { Customer } from './customer'
import { Order } from './order'

export class Player
{
	addressId: number;
	postalCode: string;
	streetAddress: string;
	floorUnit: string;
	isDefaultShipping: boolean;
	isDefaultBilling: boolean;
	phoneNumber: string;
	fullName: string;
	isDeleted: boolean;
	customer: Customer;
	shippingFee: number;
	orders: Order[];

}
