unit Unit1;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, Forms, Controls, Graphics, Dialogs, StdCtrls;

type

  { TForm1 }

  TForm1 = class(TForm)
    Button1: TButton;
    Button10: TButton;
    Button11: TButton;
    Button12: TButton;
    Button13: TButton;
    Button14: TButton;
    Button16: TButton;
    Button2: TButton;
    Button3: TButton;
    Button4: TButton;
    Button5: TButton;
    Button6: TButton;
    Button7: TButton;
    Button8: TButton;
    Button9: TButton;
    Edit1: TEdit;
    procedure Button10Click(Sender: TObject);
    procedure Button11Click(Sender: TObject);
    procedure Button12Click(Sender: TObject);
    procedure Button13Click(Sender: TObject);
    procedure Button14Click(Sender: TObject);
    procedure Button16Click(Sender: TObject);
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
    procedure Button5Click(Sender: TObject);
    procedure Button6Click(Sender: TObject);
    procedure Button7Click(Sender: TObject);
    procedure Button8Click(Sender: TObject);
    procedure Button9Click(Sender: TObject);
  private

  public

  end;

var
  Form1: TForm1;

implementation

{$R *.lfm}

{ TForm1 }

procedure TForm1.Button1Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button1.Caption;
end;

procedure TForm1.Button10Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button10.Caption;
end;

procedure TForm1.Button11Click(Sender: TObject);
var
  InputStr: string;
begin
  InputStr := Edit1.Text; // Supondo que Edit1 é o componente onde o usuário insere os dados

  // Remover os operadores
  InputStr := StringReplace(InputStr, '*', '', [rfReplaceAll]);
  InputStr := StringReplace(InputStr, '/', '', [rfReplaceAll]);
  InputStr := StringReplace(InputStr, '-', '', [rfReplaceAll]);
  InputStr := StringReplace(InputStr, '+', '', [rfReplaceAll]);

  // Exibir o resultado no Edit1
  Edit1.Text := InputStr;
end;

procedure TForm1.Button12Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button12.Caption;
end;

procedure TForm1.Button13Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button13.Caption;
end;

procedure TForm1.Button14Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button14.Caption;
end;

procedure TForm1.Button16Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button16.Caption;
end;

procedure TForm1.Button2Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button2.Caption;
end;

procedure TForm1.Button3Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button3.Caption;
end;

procedure TForm1.Button4Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button4.Caption;
end;

procedure TForm1.Button5Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button5.Caption;
end;

procedure TForm1.Button6Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button6.Caption;
end;

procedure TForm1.Button7Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button7.Caption;
end;

procedure TForm1.Button8Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button8.Caption;
end;

procedure TForm1.Button9Click(Sender: TObject);
begin
  Edit1.Text := Edit1.Text + Button9.Caption;
end;

end.

