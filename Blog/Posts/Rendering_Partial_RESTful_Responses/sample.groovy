$ curl -X GET -H "Accept:application/json" http://localhost:9000/custom-renderers/api/book?fields=title
[
  {
    "title": "It"
  },
  {
    "title": "The stand"
  }
]

$ curl -X GET -H "Accept:application/xml" http://localhost:9000/custom-renderers/api/book?fields=title,isbn
&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;list&gt;
  &lt;book&gt;
    &lt;isbn&gt;
      0451169514
    &lt;/isbn&gt;
    &lt;title&gt;
      It
    &lt;/title&gt;
  &lt;/book&gt;
  &lt;book&gt;
    &lt;isbn&gt;
      0307743683
    &lt;/isbn&gt;
    &lt;title&gt;
      The stand
    &lt;/title&gt;
  &lt;/book&gt;
&lt;/list&gt;

$ curl -X GET -H "Accept:application/json" http://localhost:9000/custom-renderers/api/book/1
{
  "id": 1,
  "isbn": "0451169514",
  "numberOfPages": 1104,
  "title": "It"
}

$ curl -X GET -H "Accept:application/json" http://localhost:9000/custom-renderers/api/book/1?fields=isbn,id
{
  "id": 1,
  "isbn": "0451169514"
}
