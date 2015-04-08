&lt;html&gt;
&lt;head&gt;
    &lt;meta content="main" name="layout"/&gt;
&lt;/head&gt;
&lt;body&gt;
%{--Use BlogService--}%
&lt;g:set var="blog" bean="blogService"/&gt;

&lt;ul&gt;
    &lt;g:each in="${blog.allTitles()}" var="title"&gt;
        &lt;li&gt;${title}&lt;/li&gt;
    &lt;/g:each&gt;
&lt;/ul&gt;

&lt;/body&gt;
&lt;/html&gt;
