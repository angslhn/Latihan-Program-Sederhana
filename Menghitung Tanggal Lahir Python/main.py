from datetime import datetime

now = datetime.now()

hari = ["Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"]
bulan = ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]

print(32*"-")
print("Mencari Hari dan Menghitung Umur".title())
print(53*"-")
print(f"Hari Dan Tanggal Saat Ini = {hari[now.weekday()]}, {now.day} {bulan[now.month - 1]} {now.year}")
print(53*"-")

tanggal_lahir = datetime.strptime(input("Masukan Tanggal Kelahiranmu = ".title()), "%d-%m-%Y")
umur = now.year - tanggal_lahir.year - ((now.month, now.date) < (tanggal_lahir.month,  tanggal_lahir.date))
hari_kelahiran = hari[tanggal_lahir.weekday()]

print(68*"-")
print(f"Kamu lahir pada hari {hari_kelahiran} dan umur kamu sekarang adalah {umur} tahun.".title())
print(68*"-")