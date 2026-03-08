# Calculator Design Patterns Project

### الخلاصة | Abstract
تحول هذا المشروع من كود معقد وكلاس واحد إلى نظام منظم ومرن باستخدام أنماط التصميم (Design Patterns) لضمان سهولة التوسيع والصيانة، مما يحقق مبادئ هندسة البرمجيات الحديثة.
*Transformed a monolithic, single-class calculator into a modular, scalable system using industry-standard Design Patterns.*

<br>

## الأنماط المطبقة | Design Patterns Applied

| Pattern | الوصف (Description) |
| --- | --- |
| **Singleton** | نسخة واحدة فقط من واجهة الحاسبة (Single UI Instance). |
| **Factory Method** | فصل منطق إنشاء العمليات عن الكود الرئيسي (Encapsulated Creation). |
| **Memento** | حفظ واسترجاع حالة الحاسبة / السجل (State History/Undo). |
| **Adapter** | دمج مكتبات خارجية دون تعديل الكود القديم (Legacy Bridge). |
| **Strategy** | تغيير خوارزمية الحساب أثناء التشغيل (Runtime Logic Switching). |
| **Decorator** | إضافة ميزات وسمات دون تعديل الكلاس الأصلي (Dynamic Enhancements). |

<br>

## رحلة التحول التقني | Transformation Journey
تمت إعادة هيكلة النظام بالكامل للانتقال من البرمجة المتداخلة إلى بنية برمجية تعتمد على أنماط التصميم لضمان استقرار النظام وقابليته للتطوير.

<br>

### 1. المخططات الهيكلية | UML Diagrams
يوضح الجدول التالي الفارق الجوهري بين التصميم الأولي والتصميم المطور الذي يعتمد على توزيع المسؤوليات (Separation of Concerns).

<div align="center">

| قبل التعديل (Initial Design) | بعد التعديل (Pattern-Oriented Design) |
| :---: | :---: |
| <img src="https://github.com/user-attachments/assets/5610a404-c544-4fc0-a705-88b29d5527ba" width="380"> | <img src="https://github.com/user-attachments/assets/156b60d9-6659-489a-bdab-fb5c1eb69431" width="380"> |
| *نظام يعتمد على كلاس واحد ضخم* | *هيكلية نمطية مرنة قابلة للتوسع* |

</div>

<br>

### 2. الواجهة الرسومية وتجربة المستخدم | UI/UX
تم تحسين استجابة الواجهة وتوفير إمكانية تغيير السمات ديناميكياً باستخدام نمط **Decorator** دون المساس بالمنطق البرمجي.

<div align="center">

| تطور الواجهة (UI Evolution) | نظام السمات والألوان (Dynamic Themes) |
| :---: | :---: |
| <img src="https://github.com/user-attachments/assets/90b3879a-52a7-4ed9-afbf-fc9bca4b2ee7" width="380"> | <img src="https://github.com/user-attachments/assets/3c4f3488-13be-47c8-86ce-c215019b4cf1" width="380"> |
| *تحديث توزيع العناصر لضمان سلاسة التفاعل.* | *تغيير المظهر ديناميكياً بمرونة عالية.* |

</div>

<br>


