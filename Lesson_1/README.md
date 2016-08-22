# Lesson 1: Introduction to Building websites

### Pre-flight instructions:

* If you haven't already downloaded the GWN projects folder, [click this link to download the GWN Projects folder.](https://github.com/CptMonac/Fex2016_Projects/archive/master.zip) Unzip this folder and save it to desktop.
* The `Lesson_1` folder will contain all the files you need for this lesson.
* Double-click the `BracketsPortable_English.exe` installer and install the Brackets Editor on a folder on the desktop.
* Lesson overview:
  * `Intro to HTML & CSS` : 10 - 15 min
  * `Creating a webpage for your new company` : 45 min
  * `Recap` : 20 min

### Intro to HTML & CSS
![OpenGWNFolder](readmeFiles/OpenFiles.jpg)
*HTML in Brackets Editor*

HTML stands for HyperText Markup Language. Hypertext means "text with links in it". Any time you click on a word or link that brings you to a new webpage, you've clicked on hypertext.

A markup language is a programming language that is used to make text do more than just sit on a page. It can turn text into images, links, tables, lists, and much more. CSS stands for Cascading Style Sheets and it's the thing that makes webpages look pretty. You can think of it like skin and makeup that covers HTML pages.

In this lesson, you will learn how to build a website. You and your partner are the founders of a new company and you want to build a website. You will fill out your company details over the course of this lesson in the instructions below.

Let's open your website now and take a look at what it currently looks like:
> In the `Lesson_1` folder, double-click on the file called `index.html`. This is your website and we'll be adding to it over the course of this lesson.

The webpage looks empty but actually it's not - you just can't see the things that are in there right now. Let's open the page in an HTML editor and take a look:
> 1. On your desktop, navigate to the `BracketsPortable` folder you extracted from the `Lesson_1` folder earlier. Open the `BracketsPortable.exe` file
> 2. In Brackets, go to the `File` menu and click on `Open Folder`.
> 3. Navigate to the `Fex2016_Projects` folder on your desktop and select the `Lesson_1` folder to open.
> 4. Double-click the `index.html` file in the Brackets editor. You should see sample code in the HTML file now.

**Pre-lesson prep**
* Follow the numbered instructions below in order. After you have completed a numbered instruction, save your code (`Ctrl + s`). You should see changes in the `index.html` file.
* Switch with your partner after you've verified your changes.
* On the right side of the editor, you should see a lightning icon that says `Live preview` if you hover over it. Click the icon to automatically build your web page as you type code. The lightning icon will turn yellow when it is activated.
* While you're typing code, the Brackets editor can offer you suggestions for what it things the words are. If you want to accept them, hit the `Enter` button.

### Creating a webpage for your new company
![webdesign](readmeFiles/webdesign.jpg)
*Courtesy of webdesigner depot*

In this lesson, you will learn how to build a website. You and your partner are the founders of a new company and you want to build a website. You will fill out your company details over the course of this lesson in the instructions below.

#### #1: Company name
Let's add the name of your company to the website.

**Discuss a company name with your partner and enter the name of your company in-between the  `title` tags.**

>*Reference: `<title> </title>`*  
*The title tag tells your browser the title of the page. It shows up as the text inside a browser tab.*

> *Example: `<title> Hooli </title>` -> this sets the title of your page as Hooli.*

#### #2: Headers
**Go to the `body` tag. Then, create a header with your company name that will be displayed in the web page.**

>*Reference: `<body>`*  
*The `body` tag is where everything you see on a web page goes.*

---
>*Reference: `<h1> </h1>`*  
*The `<h1>` tag allows you to create a header for the text on a webpage. You can also create headers of smaller sizes using `<h2>`, `<h3>`, `<h4>`, `<h5>` and `<h6>`.*

> *Example: `<h1> Hooli </h1>` -> This creates a header with the text, Hooli.*

#### #3: Pictures
Let's add a picture to your webpage.

**Add the `companypic.jpg` picture located in the assets folder to the webpage.**

>*Reference: `<img>`*  
*The `<img>` tag allows you to add images to your web page. You specify which image to add using an attribute called `src`. The `<img>` tag is not like the other tags you've seen so far. It does not require a closing tag.*

> *Example: `<img src="assets/danity.jpg">` -> This will add an image from the assets folder called 'danity.jpg' to the web page.*

#### #4: Sizing
Let's make the image on the webpage a little bigger.

**Modify your image from above to have a width of 1200 pixels.**

>*Reference: `width`*  
*The `width` attribute for the `<img>` tag allows you to control the display width for an image.*

> *Example: `<img src="assets/danity.jpg" width="200px">` -> This will set the width of the 'danity.jpg' picture to 200 pixels.*

#### #5: Alignment
Let's center align the web page so everything is not hugging the left edge. We will do this by modifying a CSS file. The HTML tags that you have already created have corresponding CSS tags that you can use to modify how the tags appear on the webpage.
> Double-click on the `style.css` file under the `assets` folder on the left. We will use this css file to edit display properties for your webpage.

**Go to the `style.css` file. Then, in the `body{}` tag, center-align the site body so everything is not hugging the left edge.**

>*Reference: `body{}`*  
*`Body{}` in the CSS file refers to the `<body>` tag from the HTML file. You can modify properties here that you want to apply to the entire body of the HTML site.*

---
>*Reference: `text-align: <center>, <left>, <right>`*  
*The `text-align` property allows you to define how you want the text of the tag to be aligned. You can choose `center`, `left`, or `right`.*

> *Example: `text-align: right;` -> This will align the text on the web page to the right.*

#### #6: Fonts
Let's make the text on your webpage more legible.

**Change the font for the body of the page to "Arial"**
>*Reference: `font-family: "font name"`*  
*The `font-family` property changes the font of the tag to the tag specified in `"font name"`.*

> *Example: `font-family: "Times New Roman";` -> This will change the font of the body of the page to Times New Roman.*

#### #7: Paragraphs
Let's add more information about your company to the website. Go back to the `index.html` file.

**Discuss with your partner about what your company does and sells. Add information about what your company does and sells to the site.**

>*Reference: `<p> </p>`*  
*The `<p>` tag creates a paragraph where you can put text on a website.*

> *Example: `<p> My company creates awesome diagrams and presentation materials for company board meetings. </p>` -> This example creates a paragraph with the text above.*

#### #8: Multiple Paragraphs
Let's add more information about the founders of the company to the website.

**Discuss with your partner about what to include in a short bio in the webpage. Create another paragraph with a short biography of each of the founders.**

#### #9: Links
Let's add links to your social media pages to the site.

**Add links for Facebook.com and Twitter.com to your site.**

>*Reference: `<a> </a>`*  
*The `<a>` tag is called an anchor tag and allows you to add links to other sites on your websites. You can use the `href` attribute of the tag to tell the browser which site you want to link to. Don't forget to add `http://` in front of the website you want to visit. *

> *Example: `<a href="http://www.google.com"> Visit our Google </a>` -> This creates a link that links to Google.com when you click the text "Visit our Google".*

### #10: Styling links
Let's style those links you created above to look more like buttons. This instruction will be broken up into multiple sections:

a. **Go to the `style.css` file. Then, in the `a{}` tag, add a solid border around the links in the webpage.**

>*Reference: `a{}`*  
*`a{}` in the CSS file refers to the `<a>` anchor tag from the HTML file. Modifying properties in this section, will affect all links on the webpage.*

---
>*Reference: `border: <solid>, <dotted>, <dashed>, <groove>, <ridge>, <inset>, <outset>, <none>, <hidden>`*  
*The `border` property specifies what kind of border you want to display for an HTML tag. You can choose a solid border, dotted border, dashed border, groove border, ridge border, inset border, outset border, no border, or a hidden border.*

> *Example: `border: dotted;` -> This will create a dotted border around the anchor tag.*

b. The border you created in the instruction above is very close to the text. Let's add more space between the border and the text.

**In the `a{}` tag, add a padding of 20px so you can add space between the border and text.**

>*Reference: `padding: <no. of pixels>`*  
*The `padding` property is used to generate space around a tag.*

> *Example: `padding: 40px;` -> will create a 40px space around the anchor tag.*

c. The borders now seem to be expanding into the paragraph above. Let's fix this.

**In the `a{}` tag, use the `display` property to tell the browser to draw the anchor tag with an `inline-block`.**

>*Reference: `display: <inline>,<block>, <inline-block>, <flex>, <table>, <inline-table>`*  
*The `display` property specifies the type of box that will be used to drawn an HTML element. You can choose between inline, block, inline-block, flex, table, and inline-table drawing styles.*

> *Example: `display: block;` -> will draw the anchor tag in a block style.*

d. Let's remove the underline from the links on your webpage.

**Remove the underline from the anchor tag containing your Facebook and Twitter links.**

>*Reference: `text-decoration:<none>, <underline>, <overline>, <line-through>`*  
*The `text-decoration` property specifies the decoration you want to add to text. You can choose between no decoration, underline decoration, overline decoration, and a line-through decoration.*

> *Example: `text-decoration: overline;` -> will add an overline decoration to the text in a tag.*

#### #11: Styling paragraphs
Let's style the paragraphs you created earlier to make them easier to read. This instruction will be broken up into multiple sections:

a. The paragraphs in the page look wide. Let's give them a proper margin.

**In the `p{}` tag, change the `width` of the paragraph tag to be 800px.**

>*Reference: `width: <no. of pixels>`*  
*The `width` property changes the width of your tag to the number you specify.*

> *Example: `width: 200px;` -> will change the width of the paragraph tag to 200px.*

b. **In the `p{}` tag, increase the `font-size` of the paragraphs in your page to 21px.**

>*Reference: `font-size: <no. of pixels>`*  
*The `font-size` property changes the size of the text in your tag.*

> *Example: `font-size: 30px;` -> will change the font size of the paragraph tag to 30px.*

c. The lines in the paragraphs look squished together. Let's add more space between the lines.

**In the `p{}` tag, increase the `line-height` of the paragraphs to 1.6.**

>*Reference: `line-height: <no.>`*  
*The `line-height` property specifies the space between the lines in two paragraphs using the pixel value. The number you specify will be multiplied by the current font size to set the line height.*

> *Example: `line-height: 5;` -> will multiply the current font-size by 5 to set the line height.*

d. The paragraphs looks jagged with center-align. Let's apply a left-align to only the paragraphs in the page.

**In the `p{}` tag, add a left align for paragraphs in the webpage.**

>*Reference: `text-align: <center>, <left>, <right>`*  
*The `text-align` property allows you to define how you want the text of the tag to be aligned. You can choose `center`, `left`, or `right`.*

> *Example: `text-align: right;` -> This will align the text on the web page to the right.*

e. Let's add more space between the paragraphs to make them more distinct.

**In the `p{}` tag, add a 10px space between your paragraphs.**

>*Reference: `padding: <no. of pixels>`*  
*The `padding` property is used to generate space around a tag.*

> *Example: `padding: 40px;` -> will create a 40px space around the paragraph tag.*

#### #12: Congratulations!!
Congratulations, your web page is complete. Feel free to continue editing and tweaking any additional properties you want.
