import os

def open_data():
    
    folder = 'database_pengguna/data_pengguna'
    
    if not os.path.exists(folder):
        os.makedirs(folder)
    
    try:
        with open("database_pengguna/data_pengguna/pengguna.txt", "r"):
            pass
    except:
        with open("database_pengguna/data_pengguna/pengguna.txt", "w", encoding="utf-8"):
            pass

def read_data():
    print(f" {"-----------------------":^53}")
    print(f" {"| SEMUA DATA PENGGUNA |":^53}")
    
    try:
        with open("database_pengguna/data_pengguna/pengguna.txt", "r") as file:
            data_pengguna = file.readlines()
                        
        print(" |-----------------------------------------------------|")
        print(f" |{"ID":^6}|{"Nama Pengguna":^34}|{"Umur":^11}|")
        print(" |-----------------------------------------------------|")
        
        if len(data_pengguna) > 0:
            for no, pengguna in enumerate(data_pengguna, start=1):
                nama = pengguna.split(",")[0].split("=")[1].strip()
                umur = pengguna.split(",")[1].split("=")[1].strip()
                
                print(f" |{no:^6}|{nama.title():^34}|{umur:^11}|")
                print(" |-----------------------------------------------------|")
        else:
            print(f" |{"Data pengguna tidak ditemukan":^53}|")
            print(" |-----------------------------------------------------|\n")
    except:
        with open("database_pengguna/data_pengguna/pengguna.txt", "w", encoding="utf-8"):
            print(" Data pengguna tidak ditemukan.")
            
def add_data():
    print(f" {"-----------------------------":^53}")
    print(f" {"| MENAMBAHKAN DATA PENGGUNA |":^53}")
    print("------------------------------------------------------")
    
    while True:
        nama_pengguna = input(" - Nama = ").strip().lower()
        umur_pengguna = input(" - Umur = ").strip()
        print("------------------------------------------------------")
        
        try:
            with open("database_pengguna/data_pengguna/pengguna.txt", "a", encoding="utf-8") as file:
                file.write(f"Nama={nama_pengguna},Umur={umur_pengguna}\n")
                pilihan_tambah_lainnya =  input("\n Tambahkan data lainnya (Y/T)? ")
                
                if pilihan_tambah_lainnya == "Y":
                    print("\n ------------------------------------------------------")
                elif pilihan_tambah_lainnya == "T":
                    break
                else:
                    print("\n Pilihan tidak valid, Anda kembali ke menu...")
                    break
        except:
            print("\n Data pengguna gagal ditambahkan.")
    
    print("\n Data pengguna yang dimasukan berhasil ditambahkan.")

def update_data():
    print(f" {"--------------------------":^53}")
    print(f" {"| MENGUBAH DATA PENGGUNA |":^53}")
    print("---------------------------------------------------")
    cari = input(' Cari nama pengguna = ').strip().lower()
    
    try :
        with open('database_pengguna/data_pengguna/pengguna.txt', 'r') as file:            
            data_pengguna = file.readlines()
            
        exist = False
        index_pengguna = None
            
        for index, pengguna in enumerate(data_pengguna, start=0):
            is_exist = cari == pengguna.split(",")[0].split("=")[1].strip()
                
            if is_exist:
                exist = True
                index_pengguna = index
                break
            
        if not exist:
            return print("\n Pengguna tidak ditemukan.")
                
        print(f"\n Pengguna ditemukan dengan ID {index_pengguna + 1}\n")
                
        print("---------------------------------------------------")
        nama = input(" Nama pengguna baru = ").strip().lower()
        umur = input(" Umur pengguna baru = ").strip()
        print("---------------------------------------------------")
                              
        data_pengguna[index_pengguna] = f"Nama={nama},Umur={umur}\n"
            
        with open('database_pengguna/data_pengguna/pengguna.txt', "w", encoding="utf-8") as update_pengguna:
            update_pengguna.writelines(data_pengguna)
    except:
        print(' Gagal mencari data pengguna.')
        

def delete_data():
    print(f" {" ---------------------------":^53}")
    print(f" {" | MENGHAPUS DATA PENGGUNA |":^53}")
    print(" ---------------------------------------------------")
    cari = int(input(' Cari ID pengguna = '))
    
    try: 
        with open('database_pengguna/data_pengguna/pengguna.txt', "r") as data_pengguna:
            semua_pengguna = data_pengguna.readlines()
            
        if cari > len(semua_pengguna) or cari < 0:
            return print("\n Pengguna tidak ditemukan.")
            
        pengguna = semua_pengguna[cari - 1]
        
        print(f"\n Pengguna dengan ID {cari} ditemukan.")
            
        print("\n |-----------------------------------------------------|")
        print(f" |{"ID":^6}|{"Nama Pengguna":^34}|{"Umur":^11}|")
        print(" |-----------------------------------------------------|")
            
        nama = pengguna.split(",")[0].split("=")[1].strip()
        umur = pengguna.split(",")[1].split("=")[1].strip()
                
        print(f" |{(cari):^6}|{nama.title():^34}|{umur:^11}|")
        print(" |-----------------------------------------------------|")
        
        konfirmasi_hapus = input(f"\n Hapus data dengan ID {cari} (Y/T)? ")
        
        if konfirmasi_hapus == "Y":
            semua_pengguna.pop(cari - 1)
            with open("database_pengguna/data_pengguna/pengguna.txt", "w", encoding="utf-8") as rewrite_delete_pengguna:
                rewrite_delete_pengguna.writelines(semua_pengguna)
                
                print(f"\n Data dengan ID {cari} berhasil dihapus.")
    except:
        pass