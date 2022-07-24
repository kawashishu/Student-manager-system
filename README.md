# Student-Management-System

* Student-Management-System, hibernate (sqlServer) + swing  
* Sinh viên: Nguyễn Hữu Phương
* MSSV: 19120625  
* Email: huuphuong130301@gmail.com

## Clone về máy và chạy  

* Đồ án sử dụng SQLServer  
* File cấu hình `SQLSetting.txt` chứa username, password và tên db. Có thể sửa đổi các thông tin này cho phù hợp  
* Các tuỳ chọn sửa đổi sâu hơn về DB nằm trong file `HibernateUtil.java` (nằm trong đường dẫn `./src/main/java/com/hibernate/util/HibernateUtil.java`)  
* Build: `mvn compile`  
* Package: `mvn package`  
* Sau khi package, ta sẽ có file jar. Để file `SQLSetting.txt` vào trong cùng thư mục mẹ với file jar (`/target/QLSV`)  
* Run: `java -jar QLSV.jar`. File jar ở trong `/target/QLSV/QLSV.jar`  

## Các chức năng trong bài

1. Import danh sách lớp  
2. Thêm 1 sinh viên vào lớp  
3. Import TKB cho lớp  
    3.1. Mặc định mọi sinh viên đều phải học các môn học có trong tkb của lớp mình  
    3.2. Sinh viên xem được tkb của mình  
4. Đăng ký/Huỷ đăng ký môn học  
5. Xem danh sách lớp  
6. Xem TKB  
    6.1. Xem tkb của cả 1 lớp  
    6.2. Xem tkb của 1 sinh viên  
7. Import bảng điểm theo lớp học + môn học  
8. Xem bảng điểm
    8.1. Xem bảng điểm theo lớp học + môn học  
    8.2. Cho biết tỷ lệ đậu rớt và danh sách đậu rớt kèm theo  
9. Sửa điểm 1 sinh viên  

