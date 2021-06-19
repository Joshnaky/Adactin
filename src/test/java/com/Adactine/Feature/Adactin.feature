Feature: Hotel Booking in Adactin Application 
@SmokeTest
Scenario Outline: Adactin
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click on The Login Button And It Navigates To The Select Hotel page

Examples:
	|username|password|
	|aaa|123|
	|bbb|5658|
	|joshnaky|LoveyouLaddu|

@SanityTest
Scenario Outline: Adactinn
When user Select The"<location>" In Location Field
And user Select The "<hotel>" In Hotels Field
And user Select The "<type>" In Room Type Field
And user Select The "<rooms>" In Number Of Rooms Field
And user Enter The "<in>" Check In Date Field
And user Enter The "<out>" Date In Check Out Date Field
And user Select The "<adult>" In Adults Per Room Field
And user Select The "<kids>" In Children Per Room Field
Then user Click The Search Button And It Navigates To the Select Hotel Page

Examples:
|location|hotel|type|rooms|in|out|adult|kids|
|Sydney|Hotel Sunshine|Standard|5|17/06/2021|18/06/2021|2 - Two|1 - One|

@SanityTest
Scenario:
When user Selects the Hotel In Select RadioButton
Then user Clicks On Continue Button And It Navigates To Book A Hotel page

@SanityTest
Scenario:
When user Enters First Name In First Name Field
And user Enters Last Name In Last Name Field
And user Enters The Billing Address In Billing Address Field
And user Enters The Credit Card No In Credit Card No Field
And user Selects The Credit Card Type In Credit Card Type Field
And user Selects The EXpiry Month in Select Month DropDown
And user Selects The Expiry Year in Select Year DropDown
And user Enters CVV Number In CVV Number Field
Then user Clicks Book Now Button and It Navigates to Booking Confirmation Page

@RegressionTest
Scenario:
Then user Clicks My Itinerary To Check And It Navigates to Booked Itinerary page

@RegressionTest
Scenario:
Then user Clicks Logout Button To Logout from Application