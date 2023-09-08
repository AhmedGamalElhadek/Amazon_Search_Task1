# Amazon_Search_Task1
This project contains automated test scenarios using Selenium WebDriver to interact with the Amazon website.

## Scenario 1: Searching for Car Accessories and Adding to Cart

1. Open Amazon: Navigate to the Amazon website.
   - URL: [https://www.amazon.com/](https://www.amazon.com/)

2. Search for "Car Accessories" in the search bar.

3. Select the first item from the search results.

4. Add the selected item to the cart.

5. Go to the cart and check if the item has been added successfully.

## Scenario 2: Browsing Today's Deals, Filtering, and Adding to Cart

1. Open Today's Deals: Navigate to the Today's Deals section.
   - URL: [https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb](https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb)

2. Apply filters from the left side:
   - Select "Headphones" and "Grocery" filters.

3. Filter by discount:
   - Choose "10% off or more."

4. Navigate to the fourth page of deals.

5. Select any item from the deals on the fourth page.

6. Add the selected item to the cart

## Test Execution

To execute these scenarios, you will need to set up your Selenium WebDriver environment and write the corresponding automation scripts in a programming language of your choice (e.g., Java, Python). Ensure that you have the necessary WebDriver executable (e.g., ChromeDriver) and dependencies installed.

Once the test scripts are ready, run them to verify the functionality of the scenarios.

### Prerequisites

- [Selenium WebDriver](https://www.selenium.dev/downloads/): Download and install Selenium WebDriver for your chosen programming language.


#### Author
Ahmed Gamal Elhadek

##### License
This project is licensed under the MIT License - see the LICENSE file for details.


