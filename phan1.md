Việc đưa các thông số như:

tên bệnh viện
hotline
IP database
port server
username/password

vào file application.properties thay vì viết cứng trong Java giúp ứng dụng linh hoạt hơn rất nhiều 

1. Dễ bảo trì (Maintainability)

Nếu hard-code:

String hospitalName = "Bệnh viện đa khoa quốc tế";

thì khi đổi tên bệnh viện, bạn phải:

tìm toàn bộ project
sửa từng file
dễ sót
dễ gây bug

Trong khi dùng:

hospital.name=Bệnh viện đa khoa quốc tế

thì chỉ sửa đúng 1 nơi duy nhất.

2. Tách biệt cấu hình và logic

Code Java chỉ nên xử lý nghiệp vụ.

Ví dụ:

khám bệnh
quản lý thuốc
tính viện phí

Còn thông số cấu hình nên nằm ngoài code.

Nó giống kiểu:

Đầu bếp tập trung nấu ăn
Người quản lý thay đổi menu và giá.

3. Dễ triển khai nhiều môi trường

Ví dụ:

Môi trường	Hotline
Local	1900-1111
Test	1900-2222
Production	1900-9999

Chỉ cần đổi file cấu hình mà không cần sửa source code.

4. An toàn và chuyên nghiệp hơn

Các thông tin như:

database IP
username
password
API key

không nên viết cứng trong code vì:

khó quản lý
dễ lộ thông tin
khó deploy  