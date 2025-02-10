unit Unit3;

{$mode ObjFPC}{$H+}

interface

uses
  Classes, SysUtils, mysql56conn, SQLDB, DB;

type

  { TDataModule1 }

  TDataModule1 = class(TDataModule)
    DataSource1: TDataSource;
    DataSource2: TDataSource;
    DataSource3: TDataSource;
    MySQL56Connection1: TMySQL56Connection;
    SQLQuery1: TSQLQuery;
    SQLQuery2: TSQLQuery;
    SQLQuery3: TSQLQuery;
    SQLTransaction1: TSQLTransaction;
  private

  public

  end;

var
  DataModule1: TDataModule1;

implementation

{$R *.lfm}

{ TDataModule1 }

end.

