
# Introduction

This project demonstrates how katalon studio helps users to automate application behind the shadow DOM. it contains some test cases for the shadow dom.

# Requirement

* Katalon studio v8.5.2 beta
* Shadow DOM test application

# What is Shadow DOM

Shadow DOM allows hidden DOM trees to be attached to elements in the regular DOM tree.

The usual way of finding an element with Katalon Studio using Locators won’t work here,  it will throw 'NoSuchElementException'. And if you look at the DOM structure, every element that has ShadowDOM also has a shadowRoot property which describes the underlying element. Shadow DOM provides encapsulation for the JavaScript, CSS, and templating in a Web Component.

**Shadow host:** The regular DOM node that the shadow DOM is attached to.
**Shadow tree:** The DOM tree inside the shadow DOM.
**Shadow boundary:** the place where the shadow DOM ends, and the regular DOM begins.
**Shadow Root:** The root node of the shadow tree.


# Use case

In the sample project I am using two different applications for the shadow dom.

* Books **(https://books-pwakit.appspot.com/)**

* Shop-Polymer **(https://shop.polymer-project.org/)**


# How to automate

* Record a test script via katalon recorder.

* Save test objects and test cases.

* Run the test on the browser.

* Verify the test result.


Thanks.
