Feature: Login to PayO

Scenario Outline: Login using credentials

Given User launched the Instance
When Enter <user> and <password> in Login page
Then Login should be done with valid credentials

Examples:
|user       | password  |
|8149547129 | admin123  |
|8149367129 | asdaafsaf |
|8149367129 |admin@9214 |
