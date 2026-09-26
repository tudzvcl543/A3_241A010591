# LAB A3 · ĐĂNG NHẬP VÀ THẺ HỒ SƠ

**Sinh viên:** Trần Tuấn Tú  
**MSSV:** 241A010591  
**Lớp:** Lập trình di động - INT4211

## Giới thiệu

Ứng dụng Android minh họa giao diện đăng nhập và hồ sơ sinh viên. Màn hình chính dùng LinearLayout theo chiều dọc; khi xoay ngang Android nạp `layout-land/activity_main.xml` để chia hai cột. Nút ở cuối màn hình mở một bản hồ sơ dựng bằng ConstraintLayout.

## Thành phần dự án

- `res/layout/activity_main.xml`: tiêu đề, biểu mẫu đăng nhập, thẻ hồ sơ ở chế độ dọc.
- `res/layout-land/activity_main.xml`: biểu mẫu bên trái và hồ sơ bên phải ở chế độ ngang.
- `res/layout/view_profile_card.xml`: thẻ hồ sơ tái sử dụng qua thẻ `<include>`.
- `res/layout/activity_constraint_demo.xml`: màn hình minh họa các ràng buộc trực tiếp.
- `res/values`: toàn bộ màu sắc, chuỗi văn bản và khoảng cách dùng chung.

## Thao tác thử

1. Mở bằng Android Studio, đồng bộ Gradle và chạy trên thiết bị hoặc máy ảo.
2. Nhập MSSV và mật khẩu, bấm **Đăng nhập** để xem thông báo mô phỏng. Biểu mẫu báo lỗi khi để trống.
3. Bật **Ghi nhớ MSSV**, đăng nhập rồi mở lại ứng dụng để kiểm tra MSSV đã lưu. Mật khẩu không được lưu.
4. Xoay ngang để xem giao diện hai cột, sau đó mở màn hình ConstraintLayout.

**Phạm vi:** bài thực hành giao diện, không xác thực tài khoản trên máy chủ. Video demo cần quay riêng nếu giảng viên yêu cầu.

## So sánh bố cục

| Tiêu chí | LinearLayout | ConstraintLayout |
|---|---|---|
| Cách đặt View | Xếp tuần tự theo hàng hoặc cột, có nhóm lồng nhau | Neo từng View bằng các ràng buộc vị trí |
| Phù hợp | Biểu mẫu và các nhóm thông tin xếp theo trình tự | Màn hình cần căn các phần tử theo nhau |
| Chế độ ngang | Sử dụng tệp riêng trong `layout-land` | Có thể đổi ràng buộc hoặc bổ sung tài nguyên ngang nếu cần |

## Câu hỏi ôn tập

1. `padding` là khoảng bên trong View; `layout_margin` là khoảng bên ngoài. `gravity` căn nội dung bên trong; `layout_gravity` căn View trong ViewGroup cha hỗ trợ thuộc tính này.
2. Dùng `dp` cho kích thước và khoảng cách, `sp` cho cỡ chữ. `px` không tự thích ứng với mật độ màn hình hoặc cỡ chữ hệ thống.
3. Trong LinearLayout ngang, hai nút có `layout_width="0dp"` và `layout_weight="1"` sẽ chia đều phần chiều rộng còn lại.
4. ConstraintLayout giúp giảm các ViewGroup lồng nhau khi giao diện có nhiều quan hệ vị trí. Không thể kết luận nhanh hơn trong mọi trường hợp nếu chưa đo.
5. Android chọn `res/layout-land` khi cấu hình là màn hình ngang; nếu không có biến thể phù hợp thì dùng `res/layout`.

## Lịch sử thực hiện

Repo ghi các commit chuẩn bị bài và commit thiết kế lại. Xem mục **Commits** trên GitHub để biết lịch sử thực tế.
