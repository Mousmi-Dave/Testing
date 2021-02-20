$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("slide.feature");
formatter.feature({
  "line": 1,
  "name": "This is Slider",
  "description": "",
  "id": "this-is-slider",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "enter to that page",
  "description": "",
  "id": "this-is-slider;enter-to-that-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "This is the Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on that shop button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "After that click on home btn",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "count of slide",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.this_is_the_Home_page()"
});
formatter.result({
  "duration": 14643969000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_that_shop_button()"
});
formatter.result({
  "duration": 4282689600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.after_that_click_on_home_btn()"
});
formatter.result({
  "duration": 6548305000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.count_of_slide()"
});
formatter.result({
  "duration": 64793500,
  "error_message": "java.lang.AssertionError: expected:\u003c3\u003e but was:\u003c1\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:647)\r\n\tat org.junit.Assert.assertEquals(Assert.java:633)\r\n\tat stepdef.StepDef.count_of_slide(StepDef.java:34)\r\n\tat ✽.Then count of slide(slide.feature:6)\r\n",
  "status": "failed"
});
});