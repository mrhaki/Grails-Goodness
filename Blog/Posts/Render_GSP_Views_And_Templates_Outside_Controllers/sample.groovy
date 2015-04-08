%{-- File: grails-app/views/email/confirm.gsp --}%
&lt;!doctype html&gt;
&lt;head&gt;
    &lt;title&gt;Confirmation&lt;/title&gt;
&lt;/head&gt;

&lt;body&gt;

&lt;h2&gt;&lt;g:render template="/email/welcome" model="[username: username]"/&gt;&lt;/h2&gt;

&lt;p&gt;
    Thank you for your registration.
&lt;/p&gt;

&lt;p&gt;
    To use the application can you directly go to the
    &lt;a href="${link}"&gt;home page&lt;/a&gt;.
&lt;/p&gt;

&lt;/body&gt;
&lt;/html&gt;
