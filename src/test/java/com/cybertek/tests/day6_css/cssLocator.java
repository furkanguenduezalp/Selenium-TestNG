package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {
    /*

    # means looking for static id
    TagName#idValue                     find an element that has id as idValue
    #id                                 find any element ...

    we can use class name even if it has space other than locator classname. for each space we put one dot. (multiple classes)
    . means looking for id
    TagName.classname                   find a link element that has class as classname
    .classsname                         find any link ...

    TagName[attribute='value']          for unique and static attribute
    [attribute='value']                 find any element with attribute value

    we cannot use test of element to locate using CSS selector

    TagName[attribute^='value']          dynamic attributes with some static part of beginning, starts with
    TagName[attribute$='value']          ends-with in xPath, ending part is static
    TagName[attribute*='value']

    css:nth-of-type(3)                   if there are multiple results, select index 3. same parent.

    TagName[attribute1='value1'][attribute2='value2']  multiple attributes

    tag>tag>tag                          //tag/tag/tag      parent to child
    tag tag                              //tag//tag         parent to descendant (any grandchild)

    from parent to child is not possible

    css~tag                             following sibling

    css cannot locate element using text                            //*[.='Text']
    css connot find from matches based on index(different parents)  (xPath)[indexNumber]
    css cannot locate child to parent                               /..

    Hierarchy of locators
    ID: unique (dynamic)
    NAME: not always unique, but not repeat that much (careful about radioButtons)
    tagName: if it is unique or first one in the page
    className: if there is space, we should avoid using it, tagName rules applies here too.
    CSS: partial dynamic, attribute value, more than one class, direct id
    XPATH: text of element, index, child parent

    LINKS
    go to LinkText or PartialLinkText




     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement dontClick = driver.findElement(By.cssSelector("#diasppearing_button"));
        System.out.println(dontClick.getText());

        driver.quit();

    }
}
