import os
import time
import sys

from database_pengguna import open_data, read_data, add_data, update_data, delete_data

if __name__ == "__main__":
    device_info = os.name
    
    open_data()
    
    while True:
        match device_info:
            case "posix":
                os.system("clear")
            case "nt":
                os.system("cls")
        
        print("\n -------------------")
        print(" DATA PENGGUNA")
        print(" -------------------")
        print(" 1. Lihat Data")
        print(" 2. Tambah Data")
        print(" 3. Perbarui Data")
        print(" 4. Hapus Data")
        print(" 5. Keluar")
        print(" -------------------------------------")
        pilihan_pengguna = int(input(" Masukan Pilihan = ").strip())
        print(" -------------------------------------\n")
        
        if pilihan_pengguna == 1:
            read_data()
            input("\n Klik enter untuk kembali ke menu awal...")
        elif pilihan_pengguna == 2:
            add_data()
            input("\n Klik enter untuk kembali ke menu awal...")
        elif pilihan_pengguna == 3:
            update_data()
            input("\n Klik enter untuk kembali ke menu awal...")
        elif pilihan_pengguna == 4:
            delete_data()
            input("\n Klik enter untuk kembali ke menu awal...")
        elif pilihan_pengguna == 5:
            sys.stdout.write(' Anda keluar dari program...')
            sys.stdout.flush()
            time.sleep(3)
            print(" ")
            break
        else:
            sys.stdout.write(' Anda memilih pilihan yang tidak ada.')
            sys.stdout.flush()
            time.sleep(3)
            