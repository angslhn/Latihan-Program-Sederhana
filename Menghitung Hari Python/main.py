from datetime import datetime, timedelta

date_now = datetime.now()
day = ["Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"]
month = ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
date_now_info = f"| Hari Dan Tanggal Saat Ini = {day[date_now.weekday()]}, {date_now.day} {month[date_now.month - 1]} {date_now.year} |" 

print(19*"-")
print("| Menghitung Hari |")
print(len(date_now_info)*"-")
print(date_now_info)
print(len(date_now_info)*"-")
print("| Pilih Salah Satu Dari Opsi Dibawah")
print("| 1. Hari Ke Masa Depan")
print("| 2. Hari Ke Masa Lampau")
print(35*"-")
opsi = int(input("| Pilihan = "))
print(35*"-")

if opsi == 1:
    days_ahead = int(input("| Hari Ke Depan = "))
    day_to_future = date_now + timedelta(days=days_ahead)
    day_to_future_info = f"| Jadi, {days_ahead} Hari Ke Masa Depan Dari Hari Sekarang Ini Adalah Hari {day[day_to_future.weekday()]} Dan Tanggal {day_to_future.day} {month[day_to_future.month - 1]} {day_to_future.year} |"
    print(35*"-")

    print("")

    print(len(day_to_future_info)*"-")
    print(day_to_future_info)
    print(len(day_to_future_info)*"-")

    print("")
elif opsi == 2:
    days_back = int(input("| Hari Ke Belakang = "))
    days_into_the_past = date_now - timedelta(days=days_back)
    days_into_the_past_info = f"| Jadi, {days_back} Hari Ke Masa Lampau Dari Hari Sekarang Ini Adalah Hari {day[days_into_the_past.weekday()]} Dan Tanggal {days_into_the_past.day} {month[days_into_the_past.month - 1]} {days_into_the_past.year} |"
    print(35*"-")
    
    print("")

    print(len(days_into_the_past_info)*"-")
    print(days_into_the_past_info)
    print(len(days_into_the_past_info)*"-")
    
    print("")
else:
    print("| Maaf Opsi Tidak Valid! |")
    print(35*"-")