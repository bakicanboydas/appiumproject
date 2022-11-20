@HepsiBurada
  Feature:HepsiBurada Mobile Test
    Scenario:Check adress iformation is same with product adress
      Given Allow all permissions
      When Click location part in main page
      When Select city,province,street and click save button
      When Check the popup about your locaiton has been saved
      When Click to categories from tab bar
      When Select a randomly category and it will direct list page
      When Compare location information in list page with which you selected your location from main page


    Scenario: Check favorited product is appear on my favorites page after login with user
      Given Allow all permissions
      When Click to super price from mainpage
      When Select a product from super price page but product must has two photo at least
      When Click to product image from product detail page and swipe to left
      When Close image page
      When Click favorite button from product details page
      When Login from next page and control that you are logged in
      When Go to favorites page and check that product added to this page
      Then Delete product from favorites and log out from account
