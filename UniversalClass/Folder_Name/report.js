$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/c.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Universal Class Website",
  "description": "",
  "id": "signup-universal-class-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "valid details for Registration",
  "description": "",
  "id": "signup-universal-class-website;valid-details-for-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on Subscribe",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select desired course",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters \u003cFirstName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters \u003cLastName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enters \u003cEmail\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on SignUp",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "successful SignUp is done",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "signup-universal-class-website;valid-details-for-registration;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password"
      ],
      "line": 17,
      "id": "signup-universal-class-website;valid-details-for-registration;;1"
    },
    {
      "cells": [
        "Anshula",
        "Tripathi",
        "anshula2197@gmail.com",
        "9039887576"
      ],
      "line": 18,
      "id": "signup-universal-class-website;valid-details-for-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 691215800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "valid details for Registration",
  "description": "",
  "id": "signup-universal-class-website;valid-details-for-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on Subscribe",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select desired course",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters Anshula",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters Tripathi",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enters anshula2197@gmail.com and 9039887576",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on SignUp",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "successful SignUp is done",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_subscribe()"
});
formatter.result({
  "duration": 36800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.select_desired_course()"
});
formatter.result({
  "duration": 35600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anshula",
      "offset": 12
    }
  ],
  "location": "Stepdefination.user_enters(String)"
});
formatter.result({
  "duration": 3372400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tripathi",
      "offset": 7
    }
  ],
  "location": "Stepdefination.enters(String)"
});
formatter.result({
  "duration": 70100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anshula2197@gmail.com and 9039887576",
      "offset": 7
    }
  ],
  "location": "Stepdefination.enters(String)"
});
formatter.result({
  "duration": 66600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.check_the_checkbox()"
});
formatter.result({
  "duration": 45000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.clicks_on_signup()"
});
formatter.result({
  "duration": 32300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.successful_signup_is_done()"
});
formatter.result({
  "duration": 40400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 78900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Invalid details for Registration",
  "description": "",
  "id": "signup-universal-class-website;invalid-details-for-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user clicks on Subscribe",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "select desired course",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user enter invalid details",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "clicks on SignUp button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user is not able to SignUpg",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_subscribe()"
});
formatter.result({
  "duration": 26800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.select_desired_course()"
});
formatter.result({
  "duration": 28400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_enter_invalid_details()"
});
formatter.result({
  "duration": 13228137300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.clicks_on_SignUp_button()"
});
formatter.result({
  "duration": 60800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_is_not_able_to_SignUpg()"
});
formatter.result({
  "duration": 43000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 90100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Successful Sign In",
  "description": "",
  "id": "signup-universal-class-website;successful-sign-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user clicks on Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "enter correct Email and Password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "clicks on Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "successful Sign In is done",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_sign_in()"
});
formatter.result({
  "duration": 7736553500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.enter_correct_Email_and_Password()"
});
formatter.result({
  "duration": 49300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.clicks_on_sign_in()"
});
formatter.result({
  "duration": 2411420500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.successful_sign_in_is_done()"
});
formatter.result({
  "duration": 2335011800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 54100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Unsuccessful Sign In",
  "description": "",
  "id": "signup-universal-class-website;unsuccessful-sign-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "user clicks on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "enter invalid Email and Password",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "clicks on Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user is not able to Sign In",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 9814212400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.enter_invalid_email_and_password()"
});
formatter.result({
  "duration": 466202900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1417569000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_is_not_able_to_sign_in()"
});
formatter.result({
  "duration": 2314276400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 74000,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Password activation sent to mail",
  "description": "",
  "id": "signup-universal-class-website;password-activation-sent-to-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "User should be on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User open sign in function",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Selects the forgot password",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Forgot passsword page opens",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User enter valid email",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click on reset password button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Mail for reset password is received",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 7435761100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_open_sign_in_function()"
});
formatter.result({
  "duration": 2871021800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.selects_the_forgot_password()"
});
formatter.result({
  "duration": 52700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.forgot_passsword_page_opens()"
});
formatter.result({
  "duration": 142200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_enter_valid_email()"
});
formatter.result({
  "duration": 1023402300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.click_on_reset_password_button()"
});
formatter.result({
  "duration": 78000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.mail_for_reset_password_is_received()"
});
formatter.result({
  "duration": 254500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 79900,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Password activation is not received",
  "description": "",
  "id": "signup-universal-class-website;password-activation-is-not-received",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "User should be on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "User open sign in function",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Selects the forgot password",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Forgot passsword page opens",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "User enter invalid email",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Click on reset password button",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Error message should be displayed for it",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 7213951400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_open_sign_in_function()"
});
formatter.result({
  "duration": 2893806000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.selects_the_forgot_password()"
});
formatter.result({
  "duration": 45300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.forgot_passsword_page_opens()"
});
formatter.result({
  "duration": 51700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_enter_invalid_email()"
});
formatter.result({
  "duration": 872893600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.click_on_reset_password_button()"
});
formatter.result({
  "duration": 85700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.error_message_should_be_displayed_for_it()"
});
formatter.result({
  "duration": 512254300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 82400,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "search the course on home page",
  "description": "",
  "id": "signup-universal-class-website;search-the-course-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "user enter course in search box",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "user can see the related course",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_enter_course_in_search_box()"
});
formatter.result({
  "duration": 19515553400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_can_see_the_related_course()"
});
formatter.result({
  "duration": 1904300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 682800,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "search the course by browse course",
  "description": "",
  "id": "signup-universal-class-website;search-the-course-by-browse-course",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 64,
  "name": "user enter course in search box by after clicking browse course",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "user can see the available course",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_enter_course_in_search_box_by_after_clicking_browse_course()"
});
formatter.result({
  "duration": 12035888800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_can_see_the_available_course()"
});
formatter.result({
  "duration": 2342524200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 133600,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "search the course for invalid data",
  "description": "",
  "id": "signup-universal-class-website;search-the-course-for-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 68,
  "name": "user enter random data or unavailable course",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "user can not see the courses",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_enter_random_data_or_unavailable_course()"
});
formatter.result({
  "duration": 9974362600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_can_not_see_the_courses()"
});
formatter.result({
  "duration": 2333510700,
  "status": "passed"
});
});