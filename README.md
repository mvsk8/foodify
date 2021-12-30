# Welcome to Foodify
## API
### Category

---
#### Get all categories
```http request
GET /api/categories
```

### Customer

---
#### Get customer by ID
```http request
GET /api/customers/{id}
```
#### Path Parameters
- **id** int - required

---
#### Get customer by E-Mail
```http request
GET /api/customers/byEmail/{email}
```
#### Path Parameters
- **email** String - required

### List

---
#### Get list by ID
```http request
GET /api/lists/{id}
```
#### Path Parameters
- **id** int - required

---
#### Get lists by purchase ID
```http request
GET /api/lists/byPurchase/{id}
```
#### Path Parameters
- **id** int - required

---
#### Add meal to purchase (New list entry)
```http request
POST /api/lists/mealForPurchase
```
#### RequestBody Parameters
- **purchaseId** int - required
- **mealId** int - required

---
#### Delete meal to purchase (New list entry)
```http request
DELETE /api/lists/mealForPurchase
```
#### RequestBody Parameters
- **purchaseId** int - required
- **mealId** int - required

### Meal

---
#### Get meals by restaurant ID
```http request
GET /api/meals/byRestaurant/{restaurant}
```
#### Path Parameters
- **restaurant** int - required

### Purchase

---
#### Create new purchase
```http request
POST /api/purchases
```
#### RequestBody Parameters
- **createTs** String (yyyy-mm-dd hh:mm:ss.fff) - required
- **purchaseTs** String (yyyy-mm-dd hh:mm:ss.fff) - required
- **street** String - required
- **postcodeId** int - required
- **delivererId** int - required
- **customerId** int - required

### Restaurant

---
#### Get all restaurants
```http request
GET /api/restaurants
```

---
#### Get restaurant by ID
```http request
GET /api/restaurants/{id}
```
#### Path Parameters
- **id** int - required

---
#### Get restaurant by town
```http request
GET /api/restaurants/byTown/{town}
```
#### Path Parameters
- **town** String - required

---
#### Get restaurant by town and category
```http request
GET /api/restaurants/byTownAndCategory/{town}/{category}
```
#### Path Parameters
- **town** String - required
- **category** String - required

### Town

---
#### Get all towns
```http request
GET /api/towns
```

## Contributors
- Lutz Janic - [lutzjan@students.zhaw.ch](mailto:lutzjan@students.zhaw.ch)
- Pesut Ines - [pesutine@students.zhaw.ch](mailto:pesutine@students.zhaw.ch)
- Vollenweider Marc - [vollema4@students.zhaw.ch](mailto:vollema4@students.zhaw.ch)
- Zopfi Selina - [zopfisel@students.zhaw.ch](mailto:zopfisel@students.zhaw.ch)