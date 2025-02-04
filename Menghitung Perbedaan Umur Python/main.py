from datetime import datetime
from dateutil.relativedelta import relativedelta

print("-"*29)
print("- MENGHITUNG PERBEDAAN UMUR -")
print("-"*31)
print("- Contoh Masukan : 01-01-1999 -")
print("-"*31)

print("-"*70)
nama_orang_pertama = input("- Nama Orang Pertama              = ")
kelahiran_pertama = input("- Tanggal Kelahiran Orang Pertama = ")
print("-"*70)
nama_orang_kedua = input("- Nama Orang Kedua                = ")
kelahiran_kedua = input("- Tanggal Kelahiran Orang Kedua   = ")
print("-"*70)

tanggal_hari_lahir_pertama = datetime.strptime(kelahiran_pertama, "%d-%m-%Y")
tanggal_hari_lahir_kedua = datetime.strptime(kelahiran_kedua, "%d-%m-%Y")

jumlah_hari = relativedelta(tanggal_hari_lahir_pertama, tanggal_hari_lahir_kedua)

tahun = jumlah_hari.years
bulan = jumlah_hari.months
hari = jumlah_hari.days

perbandingan = "Lebih Muda Dari" if tanggal_hari_lahir_pertama > tanggal_hari_lahir_kedua else "Lebih Tua Dari"  

print("-"*100)
print(f"- Jadi, Umur {nama_orang_pertama} {perbandingan} Umur {nama_orang_kedua}. -")
print(f"- Perbedaan Umur Di Antara Kedua Tanggal Kelahiran Orang Tersebut Adalah {abs(tahun)} Tahun {abs(bulan)} Bulan {abs(hari)} Hari -")
print("-"*100)