# E-Commerce Product Ordering System

A Java core console application that simulates an e-commerce inventory and transactional engine, processing batch text commands to manage customer records, diverse product types, and order placement validations.

## 🚀 How it Works
The application reads operational business tokens sequentially from an external database script:
* **Polymorphic Product Catalog:** Inherits shared attributes from an abstract `Product` superclass to specialized variations:
  * `PhysicalProduct`: Includes shipping and delivery logistics.
  * `DigitalProduct`: Manages instant online download channels.
* **Order Composition Architecture:** The `Order` class handles data mapping by embedding full references of a `Customer` and a `Product` alongside a randomized order identification number.
* **Transaction Safeguards:** The ordering workflow validates inputs before confirmation:
  * Aborts transaction if the `CustomerID` is invalid or not registered.
  * Blocks checkout if the item’s inventory status is flagged as `Sold_out`.

## 💻 Sample Script Layout (`INPUT.txt`)
```text
ADD_Customer 201 Sara Ahmad 2002 0555555555 sara@mail.com
ADD_Product PhysicalProduct P77 Smart_Watch 250.0 Available Express_Delivery
PLACE_Order P77 201
Quit
