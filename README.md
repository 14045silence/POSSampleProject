### ROUTES

#### items stock sum
POST /items/stock/sum

curl -X POST http://localhost:8080/items/stocks/sum -d '[{"id":"1","name":"item2","stock":5},{"id":"1","name":"item1","stock":5},{"id":"2","name":"item2","stock":7},{"id":"3","name":"item3","stock":10},{"id":"4","name":"item4","stock":2}]' -H 'Content-Type: application/json'

#### items
GET /items/

#### item detail
GET /items/{itemId}

#### add new item
POST /items/

##### request headers
```
Content-Type : application/json
```
##### request body
```
{
	"id":<string>,
	"name":<string>,
	"stock":<integer>
}
```

#### add stock to an item (undone)
POST /items/{id}/stock

##### request headers
```
Content-Type : application/json
```
##### request body
```
{
        "id":<string>,
        "name":<string>,
        "stock":<integer>
}
```

