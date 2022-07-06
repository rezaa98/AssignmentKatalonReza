* Testing yang dilakukan adalah testing untuk menjalankan beberapa method API kepada URL API yang telah ditentukan.
Method-methodnya meliputi, GET, POST, PUT, dan DELETE.

    - GET
        Method ini digunakan untuk mendapatkan list data dari API

    - POST
        Method ini digunakan untuk create data ke list data dari API

    - PUT
        Method ini digunakan untuk update data ke list data dari API

    - DELETE
        Method ini digunakan untuk menghapus data dari API.


URL API yang digunakan adalah:

GET     > https://jsonplaceholder.typicode.com/posts/1

POST    > https://jsonplaceholder.typicode.com/posts
Body    > {
  	id: 101,
    title: 'foo',
    body: 'bar',
    userId: 1,
  }

PUT     > https://jsonplaceholder.typicode.com/posts/1
Body    > {
    id: 1,
    title: 'foo',
    body: 'bar',
    userId: 1,
  }

DELETE  > https://jsonplaceholder.typicode.com/posts/1

Dari testing API tersebut juga terdapat validasi untuk memvalidasi data yang muncul.
