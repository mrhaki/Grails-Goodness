...
&lt;h1&gt;Select&lt;/h1&gt;

&lt;p&gt;Use title property of book for option values&lt;/p&gt;

&lt;select name="bookSimple" id="bookSimple" &gt;
  &lt;option value="1" &gt;It&lt;/option&gt;
  &lt;option value="2" &gt;The Stand&lt;/option&gt;
&lt;/select&gt;

&lt;p&gt;Use closure for optionValue&lt;/p&gt;
&lt;select name="bookVar" id="bookCustom" &gt;
  &lt;option value="1" &gt;It - 0451169514&lt;/option&gt;
  &lt;option value="2" &gt;The Stand - 0307743683&lt;/option&gt;
&lt;/select&gt;

&lt;p&gt;Use bookOptionValueFormatter that is defined as variable on this page&lt;/p&gt;
&lt;select name="bookVar" id="bookVar" &gt;
  &lt;option value="1" &gt;It (0451169514, 1104)&lt;/option&gt;
  &lt;option value="2" &gt;The Stand (0307743683, 1472)&lt;/option&gt;
&lt;/select&gt;

&lt;p&gt;Use bookFormatter that is passed as a model property from SampleController.&lt;/p&gt;
&lt;select name="bookModel" id="bookModel" &gt;
  &lt;option value="1" &gt;It (pages: 1104)&lt;/option&gt;
  &lt;option value="2" &gt;The Stand (pages: 1472)&lt;/option&gt;
&lt;/select&gt;
...
