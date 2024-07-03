Write BDD scenario for the following flow
login using user pass-> sign in --> on banking home page--> choose transfer money --> choose payee --> choose amount--> transfer --> success --> verify balance


Backgroud: User is registered to the application and have userID and password

Scenario outline:User transfers money
Given User Navigates to the Bank website and on the login page
When user enters <UserName> and <Password> and click on the sign button
And user choose to transfer the money <Amount> and <Payee> and transfer the amount
Then user verify the transfer success message and check the remaining Balance

Example
|UserName|PassWord|Amount|Payee|
|JohnDoe|Demo@123|2000|testUsers|


