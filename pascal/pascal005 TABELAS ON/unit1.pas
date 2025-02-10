unit Unit1;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, DB, SQLDB, mysql56conn, Forms, Controls, Graphics, Dialogs,
  StdCtrls, DBGrids;

type

  { TForm1 }

  TForm1 = class(TForm)
    DataSource1: TDataSource;
    DBGrid1: TDBGrid;
    MySQL56Connection1: TMySQL56Connection;
    SQLQuery1: TSQLQuery;
    SQLTransaction1: TSQLTransaction;
  private

  public

  end;

var
  Form1: TForm1;

implementation

{$R *.lfm}

end.

