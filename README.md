### ROUTES

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

