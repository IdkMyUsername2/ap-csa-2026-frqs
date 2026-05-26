# Account FRQ

__For this FRQ you were given an `Account` class which represents represent user accounts for a website. The class contains a helper methods, `isAvailable`, which returns a Boolean that determines whether a username is available.__

## Part A 

__In Part A Collegeboard wanted you to create the constructor for the `Account` Class which takes in a String parameter `requestedName`. In this question you would use the helper method `isAvailable` to help you determine if the parameter is available for use.__

__If `requestedName` is an available username, the `Account` constructor will assign `requestedName` to the instance variable `username`. If the username isn't available the constructor will try different variations of `requestedName` until an available username is found and assigned to the instance variable `username`.__

* If `requestedName` is "Luis-Cruz" and this username is not available, then the constructor will check the availability of "Luis-Cruz1", "Luis-Cruz2", "LuisCruz3", and so onuntil an available username is found. The first available username found is assigned to `username`.

* If `requestedName` is "PSmith" and this username is available, then "PSmith" is assigned to `username`.
  
## Part B 

__In part B CollegeBoard wants you to write a methods `getShortenedName` where you removes every hyphen "-" and the character before it.__

For Example:

if username is "Amy-Marie-Lin", getShortenedName should return
"AmMariLin".

if username is "SammyB3", getShortenedName should return
"SammyB3".
