$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on The Login Button And It Navigates To The Select Hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;adactin;;1"
    },
    {
      "cells": [
        "aaa",
        "123"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;adactin;;2"
    },
    {
      "cells": [
        "bbb",
        "5658"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;adactin;;3"
    },
    {
      "cells": [
        "joshnaky",
        "LoveyouLaddu"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;adactin;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"aaa\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on The Login Button And It Navigates To The Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1953576400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 119483200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 78503100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_page()"
});
formatter.result({
  "duration": 253309300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"bbb\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"5658\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on The Login Button And It Navigates To The Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 196703000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 80776200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5658",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 76999200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_page()"
});
formatter.result({
  "duration": 290349100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"joshnaky\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"LoveyouLaddu\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on The Login Button And It Navigates To The Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 264334100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joshnaky",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 78504800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoveyouLaddu",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 78446500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_page()"
});
formatter.result({
  "duration": 2395366100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Adactinn",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactinn",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The\"\u003clocation\u003e\" In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The \"\u003chotel\u003e\" In Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The \"\u003ctype\u003e\" In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The \"\u003crooms\u003e\" In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The \"\u003cin\u003e\" Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The \"\u003cout\u003e\" Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The \"\u003cadult\u003e\" In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The \"\u003ckids\u003e\" In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click The Search Button And It Navigates To the Select Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactinn;",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "type",
        "rooms",
        "in",
        "out",
        "adult",
        "kids"
      ],
      "line": 28,
      "id": "hotel-booking-in-adactin-application;adactinn;;1"
    },
    {
      "cells": [
        "Sydney",
        "Hotel Sunshine",
        "Standard",
        "5",
        "17/06/2021",
        "18/06/2021",
        "2 - Two",
        "1 - One"
      ],
      "line": 29,
      "id": "hotel-booking-in-adactin-application;adactinn;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Adactinn",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactinn;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The\"Sydney\" In Location Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The \"Hotel Sunshine\" In Hotels Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The \"Standard\" In Room Type Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The \"5\" In Number Of Rooms Field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The \"17/06/2021\" Check In Date Field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The \"18/06/2021\" Date In Check Out Date Field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The \"2 - Two\" In Adults Per Room Field",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The \"1 - One\" In Children Per Room Field",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click The Search Button And It Navigates To the Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Location_Field(String)"
});
formatter.result({
  "duration": 154912000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Hotels_Field(String)"
});
formatter.result({
  "duration": 137917900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Room_Type_Field(String)"
});
formatter.result({
  "duration": 246324500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Number_Of_Rooms_Field(String)"
});
formatter.result({
  "duration": 235312700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "17/06/2021",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Check_In_Date_Field(String)"
});
formatter.result({
  "duration": 154900900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18/06/2021",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Date_In_Check_Out_Date_Field(String)"
});
formatter.result({
  "duration": 134023100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Adults_Per_Room_Field(String)"
});
formatter.result({
  "duration": 254263700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Children_Per_Room_Field(String)"
});
formatter.result({
  "duration": 239763500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_the_Select_Hotel_Page()"
});
formatter.result({
  "duration": 581275800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Selects the Hotel In Select RadioButton",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Clicks On Continue Button And It Navigates To Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Selects_the_Hotel_In_Select_RadioButton()"
});
formatter.result({
  "duration": 143984800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Continue_Button_And_It_Navigates_To_Book_A_Hotel_page()"
});
formatter.result({
  "duration": 630205100,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user Enters First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Enters Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enters The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enters The Credit Card No In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Selects The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Selects The EXpiry Month in Select Month DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Selects The Expiry Year in Select Year DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enters CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Clicks Book Now Button and It Navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enters_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 199463800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 150553100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 195123700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 205710600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 282713100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_The_EXpiry_Month_in_Select_Month_DropDown()"
});
formatter.result({
  "duration": 252560600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_The_Expiry_Year_in_Select_Year_DropDown()"
});
formatter.result({
  "duration": 275862000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 157540000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_Book_Now_Button_and_It_Navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 168751800,
  "status": "passed"
});
});