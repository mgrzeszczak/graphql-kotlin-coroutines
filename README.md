# graphql reference

GraphQL reference project in Kotlin using coroutines for resolvers.

## How to start
Run GraphqlApplication.

## GraphiQL
`http://localhost:8080/graphiql`

## Sample query
```
query {
  getProductById(id:"test"){
    id
    name
    offer {
      id
    }
  }
}
```
Result:
```
{
  "data": {
    "getProductById": {
      "id": "04d2b3c9-c6e7-41d8-ab7d-b7036e3b2433",
      "name": "name",
      "offer": {
        "id": "74e1cbd2-9ef9-4d69-b77c-f9f59626816d"
      }
    }
  }
}
```
