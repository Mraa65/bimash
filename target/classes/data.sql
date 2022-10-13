INSERT INTO vehicle_accident (id,vin,damage_type_id,at_fault,accident_date,accident_reason,vehicle_model,plate_number,damage_position,damaged_accessories,image) VALUES
(1,'NAAB01BC2DE334455',1,false,'۱۳۹۶/۰۵/۱۰','خستگی و خواب آلودگی راننده','پژو پارس','ایران ۴۴-۱۲۵ص۳۳','عقب',
json_array('صندوق، گلگیر عقب چپ و راست، سپر عقب، چراغ عقب چپ، کمکهای عقب'),FILE_READ('/tmp/images/1.jpg')),
(2,'MAAN01RS2GH012131',1,false,'۱۳۹۸/۱۰/۲۸','عدم رعایت فاصله مجاز','مزدا ۳','ایران ۱۰-۱۷۳و۲۲','سپر عقب راست',
json_array('ندارد'),FILE_READ('/tmp/images/2.jpg')),
(3,'KAAM01JK2LM987654',1,false,'۱۳۹۶/۱۱/۰۵','عدم رعایت حق تقدم عبور','تویوتا کمری ۲۰۱۰','ایران ۲۰-۶۶۶ل۵۵','درب عقب راست',
 json_array('ندارد'),FILE_READ('/tmp/images/3.jpg')),
(4,'NAAB01PK2GB223344',2,true,'۱۴۰۰/۰۶/۲۰','سبقت غیرمجاز','سمند','ایران ۴۴-۵۴۳س۴۰','جلو، جلو چپ',
 json_array('درب کاپوت، سپر جلو، طبق چپ، چراغ جلو'),FILE_READ('/tmp/images/4.jpg')),
(5,'NAAT01ZY2AB998877',1,false,'۱۳۹۹/۱۲/۱۱','عدم رعایت حق تقدم عبور','پژو ۲۰۶ صندوقدار','ایران ۶۶-۳۲۱ج۱۲','عقب راست',
 json_array('ندارد'),FILE_READ('/tmp/images/5.jpg')),
(6,'NAAN01LM2NO321123',1,false,'۱۴۰۰/۰۹/۳۰','پاشیده شدن مواد شیمیایی','سایپا شاهین','ایران ۷۷-۱۵۱م۷۵','جلو چپ',
 json_array('گلگیر جلو چپ'),FILE_READ('/tmp/images/6.jpg')),
(7,'NAAN01BA2CD201030',1,false,'۱۳۹۷/۰۶/۰۵','عدم رعایت حق تقدم عبور','پژو پارس','ایران ۱۱-۵۶۵ط۲۵','عقب چپ',
 json_array('درب عقب چپ'),FILE_READ('/tmp/images/7.jpg')),
(8,'FAAB01AB2CD102030',1,false,'۱۴۰۰/۰۷/۱۰','عدم رعایت حق تقدم عبور','هیوندا آی ۱۰','ایران ۶۶-۸۸۸د۱۱','عقب راست',
 json_array('ندارد'),FILE_READ('/tmp/images/13.jpg')),
(9,'TAAK01AB2GH050607',1,false,'۱۳۹۹/۰۴/۲۰','عدم توجه به جلو','پراید ۱۳۱','ایران ۲۰-۱۲۳ی۳۳','عقب',
 json_array('درب صندوق، سپر عقب، چراغ عقب راست، گلگیر عقب راست'),FILE_READ('/tmp/images/14.jpg')),
(10,'FAAB01AB2CD012345',1,false,'۱۳۹۸/۱۰/۲۰','عدم رعایت حق تقدم عبور','رنو ال نود','ایران ۹۹-۵۶۷ق۱۲','جلو چپ',
 json_array('ندارد'),FILE_READ('/tmp/images/10.jpg')),
(11,'BAAC01MN2FE765432',2,true,'۱۳۹۶/۰۵/۱۰','خستگی و خواب آلودگی راننده','پژو ۴۰۵','ایران ۱۱-۷۷۷ج۱۵','جلو، جلو چپ',
json_array('درب کاپوت، گلگیر چپ، چراغ جلو، سپر جلو، موتور، سیم‌کشی و دسته سیم، سامانه خنک کاری موتور'),FILE_READ('/tmp/images/11.jpg')),
(12,'FAAB01AB2CD012345',1,true,'۱۳۹۴/۰۲/۳۰','سرعت غیرمجاز','رنو ال نود','ایران ۵۵-۱۲۳م۷۷','جلو و عقب',
json_array('درب کاپوت، شیشه جلو، چراغ‌های جلو، درب صندوق'),FILE_READ('/tmp/images/12.jpg'));

INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (1,'نیما','آریافر',1,1,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (2,'کامران','فردوسی',1,2,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (3,'کاوه','',1,3,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (4,'آرمان','کاویان‌پور',1,4,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (5,'نوید','مهرگان',1,5,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (6,'پرهام','جاودانی',2,1,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (7,'سیامک','پاینده',2,2,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (8,'بابک','مهرانفر',2,3,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (9,'افشین','یاوری',2,4,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (10,'اشکان','یاری',2,5,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (11,'شاهین','مهری',3,1,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (12,'کیوان','داوری',3,2,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (13,'پدرام','افشاری',3,3,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (14,'بهزاد','زندی',3,4,'09121234567');
INSERT INTO consultant (id,first_name,last_name,skill,location,phone_number) VALUES (15,'تیام','شهبازی',3,5,'09121234567');
