# TestAutomationAPI
www.hepsiburada.com /Hepsiburada Case Study_QA Çalışması / TestAutomationAPI

Projede Java programlama dili kullanılarak IntejijIDEA aracı üzerinde geliştirilmiştir.

Projede java.net.URI, java.net.http, junit.Assert kütüphaneleri kullanılmıştır.

Otomasyon Chrome browser üzerinde çalışacak şekilde hazırlanmıştır.

Otomasyon projesinde kullanılan methodlar okunulabilirliğin arttırılması ve  esneklik  sağlanabilmesi  için  'JSONResponseController'  sınıfı  içerisinde tanımlanmıştır.

Otomasyon projesinde yapılan işlemler aşağıdaki gibidir;

* BAŞARILI GET Methodu kontrolü için aşağıdaki API isteği kullanıldı:
  Kullamnılan API: https://generator.swagger.io/api/gen/clients

  API çalıştırıldıktan sonra HTTP Request status kodu kontrol edildi. 
  Assertions.assertEquals methodu ile status kodu 200 ise API isteği BAŞARILI olarak değerlendirildi.

* BAŞARISIZ GET Methodu kontrolü için aşağıdaki API isteği kullanıldı:
  Kullamnılan API: https://generator.swagger.io/api/gen/failed

  API çalıştırıldıktan sonra HTTP Request status kodu kontrol edildi.
  Assertions.assertEquals methodu ile status kodu 200 değil ise API isteği BAŞARISIZ olarak değerlendirildi.

* BAŞARILI POST Methodu kontrolü için aşağıdaki API isteği kullanıldı:
  Kullamnılan API: https://generator.swagger.io/api/gen/clients/go

  API çalıştırıldıktan sonra HTTP Request status kodu kontrol edildi.
  Assertions.assertEquals methodu ile status kodu 200 ise API isteği BAŞARILI olarak değerlendirildi.

* BAŞARISIZ POST Methodu kontrolü için aşağıdaki API isteği kullanıldı:
  Kullamnılan API: https://generator.swagger.io/api/gen/clients/failed

  API çalıştırıldıktan sonra HTTP Request status kodu kontrol edildi.
  Assertions.assertEquals methodu ile status kodu 200 değil ise API isteği BAŞARISIZ olarak değerlendirildi.

